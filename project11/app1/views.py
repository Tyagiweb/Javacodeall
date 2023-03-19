from django.shortcuts import render
from .models import Student

# Create your views here.

def index(request):
    return render(request,'index.html')

def content(request):
    fname=request.POST['fname']
    lname=request.POST['lname']

    newuser=Student.objects.create(FirstName=fname,LastName=lname)
    return render(request,'show.html')

    

