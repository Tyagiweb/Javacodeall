from django.contrib import admin
from django.urls import path,include
from app1 import views

urlpatterns = [
    path('', views.index,name='index'),
    path('show/', views.show,name='show'),
    path('register/', views.register,name='register'),
    path('content/', views.content,name='content'),


]