<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="sdp.ratajo.amaderbari.dto.addresspack.Address"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Results</title>
</head>
<body>

<%
    for(int i=0;i<${flats}.size();++i)
    {
        out.println($flats.get(i));
    }
    %>
	<article class="vendor list js-vendor-list-vendor-panel">
        <div class="vendor__inner">
            <div class="vendor__image">
    <a href="/restaurant/s4pb/fajitas-uttara">


<img alt="Fajitas Uttara" width="80" height="80" src="//assets.foodpanda.com.bd/layout/themes/capricciosa_foodpanda/images/en/no_pic_logo.png?v=1427741400" data-src="//assets.foodpanda.com.bd/dynamic/images/vendors/s4pb_sqp.jpg" />
</a>
</div>

            <div class="vendor__details">
                <div class="vendor__title">
        <a href="/restaurant/s4pb/fajitas-uttara">Fajitas Uttara</a>
</div>

                <ul class="vendor__cuisines">
    <li>Mexican Food</li><li>Snacks</li></ul>

                <div class="vendor__ratings_recommendation__container">
                    <div class="vendor__ratings">


            <a href="/restaurant/s4pb/fajitas-uttara#reviews">
        <div
        class="rating  "
                        >
                    <i class="stars" itemprop="ratingValue" content="4">
                <i style="width:80%"></i>
            </i>

                    <p class="review">
                                    <span
                                                >
                        66
                    </span>
                    Ratings
                            </p>
            </div>
            </a>
    </div>

                                            <div class="vendor__recommendations">
    <div class="recommendation-wrapper js-recommendation-container" data-object-type="vendor" data-object-key="s4pb">
    <span
            class="hidden js-recommendation-tooltip js-recommendation-info recommendation "
            data-action=""
            data-placement="top"
            data-title=""
            data-toggle="tooltip"
            data-trigger="hover"
    >
    </span>
</div>

</div>
                                    </div>


                <div class="vendor__availability">
                        <dl class="vendor__delivery-time">
                <dt>Delivery in</dt>
                <dd>
                                        1h 40min
                </dd>
            </dl>

                            <dl class="vendor__delivery-fee">
                    <dt>Delivery fee:</dt>
                    <dd>
                        Tk 50.00
                    </dd>
                </dl>

                    <dl class="vendor__pickup-time">
                <dt>Pickup time:</dt>
                <dd>

                                            35min
                                    </dd>
            </dl>

            <dl class="vendor__order-minimum">
            <dt>Min. order value:</dt>
            <dd>
                                Tk 300.00
            </dd>
        </dl>
    </div>

                <ul class="vendor__characteristics">


            <li class="characteristic__pay-online" title="Pay online"></li>

                </ul>
            </div>


            <div class="vendor__cta">
    <a href="/restaurant/s4pb/fajitas-uttara" class="btn btn-primary">
                                    Go to menu
                        </a>
</div>
        </div>
    </article>

</body>
</html>
