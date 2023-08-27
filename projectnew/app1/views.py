from django.shortcuts import render
from .models import Student

# Create your views here.
def register(request):
    return render(request,'register.html')


def data(request):
    firstname=request.POST['firstname']
    middlename=request.POST['middlename']
    lastname=request.POST['lastname']
    phone=request.POST['phone']
    adress=request.POST['adress']
    email=request.POST['email']
    psw=request.POST['psw']
    user=Student.objects.create(Firstname=firstname,Middlename=middlename,Lastname=lastname,Mobile=phone,
                                Adress=adress,Email=email,Psw=psw)
    return render(request,'submit2.html')

def viewdata(request):
    all_data=Student.objects.all()
    return render(request,'submit.html',{'key1':all_data})

