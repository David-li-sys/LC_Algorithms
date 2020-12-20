var musicAc={

	init:function(){
		
		console.log("启动函数");
		//创建音乐播放器
		musicAc.createPlayer();
		//调用播放音乐函数
		musicAc.rdmMusic(false);
		//不断更新进度条
		setInterval(musicAc.gettime,1);
		//为进度条绑定事件
		 musicAc.barevent();
		
		
		//切歌
		var replaybtn=mui("#div_replay")[0];
		replaybtn.addEventListener("tap",function(){
			musicAc.replay();
		})
		
		//播放
		var playbtn=mui("#div_play")[0];
		playbtn.addEventListener("tap",function(){
			var img=$(this).find("img")[0];
			
			musicAc.play(img);
		})
		
		//暂停
		var mutedbtn=mui("#div_muted")[0];
		mutedbtn.addEventListener("tap",function(){
			var img=$(this).find("img")[0];
			console.log(img);
			musicAc.muted(img);
		})
		
		
	},
	//创建音乐播放器
	createPlayer:function(){
		musicM.music_player=document.createElement("audio");
	},
	//加载音乐信息，并播放音乐
	rdmMusic:function(isnew){
		mui.toast("切歌中...",{type:'div'});
		mui.getJSON(musicM.musichotapi,{},function(data){
			// console.log(data);
			// console.log(data.data.artistsname);
			// musicM.music_player.src=data.data.url;
			// musicM.music_player.play();
			
			musicM.musicinfo.title=data.data.name;
			musicM.musicinfo.singer=data.data.artistsname;
			musicM.musicinfo.musicurl=data.data.url;
			musicM.musicinfo.picurl=data.data.picurl;
			
			$("#title").html(musicM.musicinfo.title);
			$("#singer").html(musicM.musicinfo.singer);
			$("#musicbg").css("background-image","url("+musicM.musicinfo.picurl+")");
			$("#pan").css("background-image","url("+musicM.musicinfo.picurl+")");
			var playbtn=mui("#div_play")[0];
			var img=$(div_play).find("img")[0];
			musicAc.play(img,isnew);
			
		})
		
	},
	
	//播放音乐函数
	play:function(_this,isnew){
		if(musicM.music_player == null){
			mui.toast("没有音源",{type:'div'});
			return;
		}
		
		musicM.pausetime=musicM.music_player.currentTime;
		
		musicM.music_player.src=musicM.musicinfo.musicurl;
		if(isnew){
			musicM.music_player.currentTime=0;
		}else{
			musicM.music_player.currentTime=musicM.pausetime;
		}
		
		if(_this.src.indexOf("pause_button_96px.png") >= 0){
			mui.toast("暂停播放",{type:'div'});
			
			$("#pan").css("animation-play-state","paused");
		
			musicM.music_player.pause();
			
			
		
			_this.src="img/circled_play_96px.png";
		}else if(_this.src.indexOf("circled_play_96px.png") >= 0){
			mui.toast("继续播放",{type:'div'});
			musicM.music_player.play();
			
			$("#pan").css("animation-play-state","running");
			
			_this.src="img/pause_button_96px.png";
		}
		
	},
	
	
	//暂停或继续函数
	muted:function(_this){
		if(musicM.music_player == null){
			mui.toast("没有音源",{type:'div'});
			return;
		}
		if(_this.src.indexOf("audio_96px.png") >= 0){
			musicM.music_player.muted=true;
			_this.src="img/mute_96px.png";
		}else if(_this.src.indexOf("mute_96px.png") >= 0){
			musicM.music_player.muted=false;
			_this.src="img/audio_96px.png";
		}
			
		
	},
	//重新播放
	replay:function(){
		$("#div_play").find("img")[0].src="img/circled_play_96px.png";
		musicAc.rdmMusic(true);
	},
	//更新进度条函数
	gettime:function(){
		var totalTime=musicM.music_player.duration/60;
		var currentTime=musicM.music_player.currentTime/60;		
		var nowposi=currentTime/totalTime;
		
		 //console.log(totalTime);
		// console.log(currentTime);
		// console.log(nowposi);
		
		var i=nowposi*100+"%";
		if(nowposi>0.999){
			musicAc.replay();
			musicM.music_player.currentTime=0;
		}
		$(".timeline_now").children(":first").css("width",i);
	},
	//进度条事件
	barevent:function(){
		var t=false;
		
		$(".timeline_now").mouseleave(function(e){
			t=false;
		
		})
		$(".timeline_now").mousedown(function(e){	
			t=true;
			$("#div_play").find("img")[0].src="img/pause_button_96px.png";
			var x=e.pageX;
			
			var totalTime=musicM.music_player.duration;
			//musicAc.getposition(x,y);
			var lf=$(".timeline_now").offset().left;
			
			var len=$(".timeline_now").width();
			
			var n=totalTime*(x-lf)/len;
			musicM.music_player.currentTime = n;
			musicM.music_player.play();				
		
		})
		$(".warp_panel").mouseup(function(e){	
			t=false;
		})
		
		
		$(".timeline_now").mousemove(function(e){
			if(t){
				$("#div_play").find("img")[0].src="img/pause_button_96px.png";
				var x=e.pageX;
				
				var totalTime=musicM.music_player.duration;
				//musicAc.getposition(x,y);
				var lf=$(".timeline_now").offset().left;
				
				var len=$(".timeline_now").width();
				
				var n=totalTime*(x-lf)/len;
				musicM.music_player.currentTime = n;
				musicM.music_player.play();
			}
			
		});
	},
	
	
	
}