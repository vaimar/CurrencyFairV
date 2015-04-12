 function getCurrency(currency)
     {

	 	var splitCurrency = currency.split("/");
		 arr = [];
       
        	  for (var i = 0; i < count; i++) {
            	  if(currencyFrom[i] ==splitCurrency[0] && currencyTo[i] == splitCurrency[1])
                	  {
            		  arr.push( {
        	 		  currencyFrom: currencyFrom[i],
        	 		  currencyTo: currencyTo[i],
        	 		  userId: userId[i],
        	 		  originatingCountry: originatingCountry[i],	 
        	 		  rate: rate[i],
        	 		  timePlaced: timePlaced[i],
        	 		  amountSell: amountSell[i],
        	 		  amountBuy: amountBuy[i]
        	 		} );
        	  }}
       
        return arr;
     }	
          

 
 $(function(){


	 
	 $('#currencyId').change(function() {

		 $("#morris-area-chart").empty();
		 	 morrisArea(getCurrency($(this).val()));
		 // $(this).val() will work here
		});
	 
	 
	 function getCurrencyChange(currency)
	 {

		 morrisArea(getCurrency(currency));
	 }

	 function morrisArea(data)
	 {
	 	 Morris.Area({
	 	        element: 'morris-area-chart',
	 	        data: data,
	 	        xkey: 'timePlaced',
	 	        ykeys: ['rate'],
	 	        labels: [' 1 EUR '],
	 	        ymin:0.7000,	 	     
	 	        
	 	    });
	 	}
	
	 morrisArea(data);
	 	
	 });
