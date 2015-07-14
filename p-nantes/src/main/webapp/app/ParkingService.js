'use strict';

app.service('ParkingService', ['$http',
                              
		function($http) {

			var Groupes_Parking = [];
			
			
		    var url = "http://" + document.location.hostname + ":" + document.location.port
    		+ document.location.pathname + "webservice/parking";
	

    
    	   $http.get(url).success( function(data){
    			var x;
    			var grps = data.opendata.answer.data.Groupes_Parking.Groupe_Parking;
				for (x in grps) {

					Groupes_Parking.push(grps[x]);
				}
    	   }
    		   
    	   );
		
			return {
				Groupes_Parking : Groupes_Parking
			};
		}]);
