package com.example.affirmationsrecyclerview

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class) //Executor of test
@LargeTest
class AffirmationsListTest {

    //situation rule for principal activity
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    //Test of static data
    @Test
    fun scroll_to_item() {
        onView(withId(R.id.recycler_view))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(9))

        /*onView(withId(R.id.recycler_view))
            .perform(
                RecyclerViewActions.scrollTo<RecyclerView.ViewHolder>(withText(R.string.affirmation10))
            )*/

        onView(withId(R.string.affirmation10))
            .check(matches(isDisplayed()))
    }
}