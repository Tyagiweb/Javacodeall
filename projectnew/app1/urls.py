from django.contrib import admin
from django.urls import path,include
from app1 import views

urlpatterns = [
    path('', views.register,name='register'),
    path('data/', views.data,name='data'),
    path('data/viewdata/', views.viewdata,name='viewdata'),
]