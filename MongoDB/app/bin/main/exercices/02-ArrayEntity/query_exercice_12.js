// Exo sur ArrayEntity

const result = db.ArrayEntity.find(
    {
        "values" : { "$in" : [0] }

    })
    printjson(result)