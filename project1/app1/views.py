from django.shortcuts import render
from .models import Student

# Create your views here.

def index(request):
    return render(request,'index.html')

def show(request):
    return render(request,'show.html')

def register(request):
    return render(request,'register.html')

def content(request):
    email=request.POST['email']
    fname=request.POST['fname']
    user=Student.objects.create(Email=email,Name=fname)
    return render(request,'submit.html')
