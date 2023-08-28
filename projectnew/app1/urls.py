from django.contrib import admin
from django.urls import path,include
from app1 import views

urlpatterns = [
    path('', views.register,name='register'),
    path('login/', views.login,name='login'),
    path('registerform/', views.registerform,name='registerform'),
    path('data/', views.data,name='data'),
    path('viewdata/', views.viewdata,name='viewdata'),
    path('login/validuser', views.validuser,name='validuser'),
    

]