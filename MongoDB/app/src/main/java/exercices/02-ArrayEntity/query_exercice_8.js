// Exo sur ArrayEntity

const result = db.ArrayEntity.find(
    {
       
        "values" : { "$all" : [2] }

    })
    printjson(result)
    