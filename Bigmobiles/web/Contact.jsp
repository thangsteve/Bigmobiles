<%-- 
    Document   : index
    Created on : May 24, 2019, 9:23:51 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
        <jsp:include page="linkcss.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="contact-main-page mt-60 mb-40 mb-md-40 mb-sm-40 mb-xs-40">
                <div class="container mb-60">
                    <div id="google-map">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3919.3253162668498!2d106.66410831474906!3d10.786376992314777!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31752ed23c80767d%3A0x5a981a5efee9fd7d!2zNTkwIEPDoWNoIE3huqFuZyBUaMOhbmcgOCwgUGjGsOG7nW5nIDExLCBRdeG6rW4gMywgSOG7kyBDaMOtIE1pbmgsIFZp4buHdCBOYW0!5e0!3m2!1svi!2s!4v1558868705698!5m2!1svi!2s" width="1200" height="280" frameborder="0" style="border:0" allowfullscreen></iframe>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-5 offset-lg-1 col-md-12 order-1 order-lg-2">
                            <div class="contact-page-side-content">
                                <h3 class="contact-page-title">Liên hệ với chúng tôi</h3>
                                <p class="contact-page-message mb-25"></p>
                                <div class="single-contact-block">
                                    <h4><i class="fa fa-fax"></i> Địa chỉ</h4>
                                    <p>590 Cách mạng tháng 8, Quận 3,TP Hồ Chí Minh--Việt Nam</p>
                                </div>
                                <div class="single-contact-block">
                                    <h4><i class="fa fa-phone"></i> Số Điện thoại</h4>
                                    <p>Mobile: (08) 123 456 789</p>
                                    <p>Đường dây nóng: 1009 678 456</p>
                                </div>
                                <div class="single-contact-block last-child">
                                    <h4><i class="fa fa-envelope-o"></i> Thư điện tử</h4>
                                    <p>yourmail@domain.com</p>
                                    <p>support@hastech.company</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-12 order-2 order-lg-1">
                            <div class="contact-form-content pt-sm-55 pt-xs-55">
                                <h3 class="contact-page-title">Hòm thư góp ý</h3>
                                <div class="contact-form">
                                    <form  id="contact-form" action="#" method="post">
                                        <div class="form-group">
                                            <label>Tên của bạn <span class="required">*</span></label>
                                            <input type="text" name="customerName" id="customername" required>
                                        </div>
                                        <div class="form-group">
                                            <label>Thư điện tử <span class="required">*</span></label>
                                            <input type="email" name="customerEmail" id="customerEmail" required>
                                        </div>
                                     
                                        <div class="form-group mb-30">
                                            <label>Nội dung</label>
                                            <textarea name="contactMessage" id="contactMessage" ></textarea>
                                        </div>
                                        <div class="form-group">
                                            <button type="submit" value="submit" id="submit" class="li-btn-3" name="submit">Gửi</button>
                                        </div>
                                    </form>
                                </div>
                                <p class="form-messege"></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        <jsp:include page="footer.jsp"></jsp:include>
        <jsp:include page="linkscript.jsp"></jsp:include>
    </body>
</html>
