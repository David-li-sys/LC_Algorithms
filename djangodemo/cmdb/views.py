from django.shortcuts import render
from django.shortcuts import HttpResponse
from django.shortcuts import HttpResponseRedirect
from django.shortcuts import render
import pymysql

conn = pymysql.connect(
    host="localhost",
    user="root",
    password="root",
    port=3306,
    db="njtc",
    charset="utf8"
)

cursor = conn.cursor()
# Create your views here.
user_list = []


def index(request):
    #return HttpResponse("hello world!")


    # sql = "select * from user"
    # num=cursor.execute(sql)
    # for row in cursor.fetchall():
    #     user={"user":row[0],"pwd":row[1]}
    #     user_list.append(user)
    # if request.method == "POST":
    #     username = request.POST.get("username",None)
    #     password = request.POST.get("password",None)
    #     print(username,password)
    return render(request,"index.html")

def checkLogin(request):
    username = request.POST.get("username", None)
    password = request.POST.get("password", None)

    number = cursor.execute("select * from user where user_name='%s' and user_pwd='%s'" % (username,password))

    if number > 0:
        return HttpResponseRedirect("/showUsers/")
        pass
    else:
        return render(request,"login.html",{"info":"账号或密码错误"})

def showUsers(request):
    user_list.clear()
    cursor.execute("select * from user")
    for x in cursor.fetchall():
        user_dict={ "userId":x[0],"username":x[1],"password":x[2]}
        user_list.append(user_dict)
    return render(request,"success.html",{"data":user_list})

def addUserUI(request):
    return render(request,"addUser.html")

def addUser(request):

    username = request.POST.get("username", None)
    password = request.POST.get("password", None)

    cursor.execute("insert into user(user_name,user_pwd) values('%s','%s')" % (username,password))

    conn.commit()

    return HttpResponseRedirect("/showUsers/")


def delUser(request):
    print("hello")
    userId = request.GET.get("userId",None)
    id = int(userId)

    cursor.execute("delete from user where user_id = %d" % id)
    conn.commit()

    return HttpResponseRedirect("/showUsers/")

