from django.shortcuts import render

# Create your views here.

from django.shortcuts import render

def mainpage(request):
    return render(request, 'pages/mainpage.html')
def company(request):
    return render(request, 'pages/company_info.html')
def content(request, content_id):
    return render(request, 'pages/content_detail.html', {'content': content})
