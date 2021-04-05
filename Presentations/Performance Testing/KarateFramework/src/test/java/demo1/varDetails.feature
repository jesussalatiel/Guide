Feature: Reusable function to capture info about the date
  
  Backgroud: Setup
  def pattern = 'MM/dd/yyyy'
  def getDate =   """
      function() {
        var SimpleDateFormat = Java.type('java.text.SimpleDateFormat');
        var sdf = new SimpleDateFormat(pattern);
        var date = new java.util.Date();
        return sdf.format(date);
      } 
      """

  Scenario: Capture today date
    def today = getDate()
    karate.log('Time Zone: '+ today)

