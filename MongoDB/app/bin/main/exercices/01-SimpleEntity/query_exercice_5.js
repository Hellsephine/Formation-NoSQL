// Exo sur SimpleEntity

const result = db.SimpleEntity.find({

    "price" : { "$gt" : 10 },
    "$or":[
        {"name":"Simple 2"},
        {"name":"Simple 3"}
    ]

   
})

printjson(result)