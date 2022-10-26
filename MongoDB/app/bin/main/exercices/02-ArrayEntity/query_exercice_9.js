// Exo sur ArrayEntity

const result = db.ArrayEntity.find(
    {
       "$or":[
        {"values" : { "$all" : [2] }},
        {"name" : "Array 2"}
       ]
       

    })
    printjson(result)
    