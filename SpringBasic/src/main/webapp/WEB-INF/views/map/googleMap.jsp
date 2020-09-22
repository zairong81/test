<!DOCTYPE html>
<html>
  <head>
    <title>Simple Map</title>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>
	    <script async defer
  			src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDT7sSTMO5sgyqu_1l0KuaIK_QAyv0U44c&callback=initMap">
		</script>
<!--   		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDZL82RRYpAr7GrwdJQ5S11-pDaZJs3n9c&callback=initMap"> -->
		
		    <style type="text/css">
      /* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
      #map {
        height: 100%;
      }

      /* Optional: Makes the sample page fill the window. */
      html,
      body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
    </style>
    <script>
      (function(exports) {
        "use strict";

        // The following example creates a marker in Stockholm, Sweden using a DROP
        // animation. Clicking on the marker will toggle the animation between a BOUNCE
        // animation and no animation.

        function initMap() {
          var map = new google.maps.Map(document.getElementById("map"), {
            zoom: 13,
            center: {
              lat: 59.325,
              lng: 18.07
            }
          });
          
          exports.marker = new google.maps.Marker({
            map: map,
            draggable: true,
            animation: google.maps.Animation.DROP,
            position: {
              lat: 59.327,
              lng: 18.067
            },
         
          });
          exports.marker.addListener("click", toggleBounce);
        }

        function toggleBounce() {
          if (exports.marker.getAnimation() !== null) {
            exports.marker.setAnimation(null);
          } else {
            exports.marker.setAnimation(google.maps.Animation.BOUNCE);
          }
        }

        exports.initMap = initMap;
        exports.toggleBounce = toggleBounce;
      })((this.window = this.window || {}));
    </script>
		
    <style type="text/css">
      /* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
      #map {
        height: 100%;
      }

      /* Optional: Makes the sample page fill the window. */
      html,
      body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
    </style>
 
  </head>
  <body>
    <div id="map"></div>
  </body>
</html>