package com.prolificinteractive.materialcalendarview;

/**
 * Different Calendar types available for the pager, which will give the amount of weeks visible.
 */
public enum CalendarMode {

  /**
   * Month Mode to display an entire month per page.
   */
  MONTHS(6),
  /**
   * Week mode that shows the calendar week by week.
   */
  WEEKS(1);
  
  /**
  * Week mode that show the calendar two weeks by two weeks.
  **/
  BI_WEEK(2);

  /**
   * Number of visible weeks per calendar mode.
   */
  final int visibleWeeksCount;

  CalendarMode(int visibleWeeksCount) {
    this.visibleWeeksCount = visibleWeeksCount;
  }
}
