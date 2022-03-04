package org.mfedorivapps.affirmations

import android.content.Context
import org.junit.Assert
import org.junit.Test
import org.mfedorivapps.affirmations.adapter.ItemAdapter
import org.mfedorivapps.affirmations.model.Affirmation
import org.mockito.Mockito

class AffirmationsAdapterTests {
    // Adapter tests
    private val context = Mockito.mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)
        Assert.assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}