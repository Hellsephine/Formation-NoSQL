// Exo sur SimpleEntity

const result = db.SimpleEntity.find(
    {
        "price" : { 		
            "$gt" : 5,
            "$lt" : 25
         }
    })
    printjson(result)
    