public class Stats {
  public static double mean(ArrayList <double> data) {
    if ((data != null) && (data.length > 0)) {
      double sum = 0.0;
      for (double num : data) {
      if (data!= null && data.length >0) {
        sum += num;
        mean=sum/data.length;
        return mean;
      }
    else {
      return Double.NaN;
    }
  }
    }
  }
      
    
  public static double stddev(ArrayList <double> data){
    double sum=0.0;
    double stdval=0.0;
    if ((data != null) && (data.length > 0)) {
      double meanval=stats.mean(data);
      for (double num : data) {
        sum+=Math.pow(num-meanval, 2);
      }
      stdval= Math.sqrt(sum/data.length);
      return stdval;
    }
    else {
      return Double.NaN;
    }
  }
    }
   
        