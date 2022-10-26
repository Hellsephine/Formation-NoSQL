// Exo sur SimpleEntity

const result = db.SimpleEntity.find({

    "$or":[
        {"name":"Simple 2"},
        {"name":"Simple 3"}
    ]

   
})

printjson(result)