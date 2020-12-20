//音乐数据模型
var musicM={
	music_player:null,
	musichotapi:"https://api.uomg.com/api/rand.music?sort=%E7%83%AD%E6%AD%8C%E6%A6%9C&format=json",
	pausetime:0,

	musicinfo:{
		title:'',
		singer:'',
		musicurl:'',
		picurl:''
	}
}