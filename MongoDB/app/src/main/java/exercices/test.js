const result = db.SimpleEntity.find({

    "price" : { "$gt" : 20 }
   
})

printjson(result)