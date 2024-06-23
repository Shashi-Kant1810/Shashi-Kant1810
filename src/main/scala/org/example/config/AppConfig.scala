package org.example.config
import org.apache.spark.sql.SparkSession
trait AppConfig {
  val spark: SparkSession = SparkSession
    .builder()
    .appName("FirstApp")
    .config("spark.master", "local")
    .enableHiveSupport()
    .getOrCreate()
}
