from django.contrib import admin
from django.urls import path,include
from app1 import views

urlpatterns = [
    path("", views.index,name="index"),
    path("content", views.content,name="content"),
]