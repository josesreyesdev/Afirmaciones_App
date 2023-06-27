package com.example.affirmationsrecyclerview

import android.content.Context
import com.example.affirmationsrecyclerview.adapter.ItemAdapter
import com.example.affirmationsrecyclerview.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {
    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {

        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        val adapter = ItemAdapter(context, dataset = data )
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}