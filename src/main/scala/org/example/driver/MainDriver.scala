package org.example.driver

import org.example.config.AppConfig

object MainDriver extends App with AppConfig{
    println("welcome to scala")
    val sampleData = Seq((1, "spark language","A","shop property"), (2, "Java","B","home"), (3, "Pyspark","C","hotel"))
    val df1 = spark.createDataFrame(sampleData).toDF("course_id", "course_name","property_type","property_used_for")
    print("schema output")
    df1.printSchema()

}
