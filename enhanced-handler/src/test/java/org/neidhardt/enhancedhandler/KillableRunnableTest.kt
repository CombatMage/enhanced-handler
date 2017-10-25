package org.neidhardt.enhancedhandler

import org.junit.Test
import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner


/**
 * Created by eric.neidhardt@gmail.com on 20.10.2017.
 */
@RunWith(RobolectricTestRunner::class)
class KillableRunnableTest {

	@Test
	fun setKilled() {
		// arrange
		val unit = KillableRunnable({
			fail("should not be called")
		})
		unit.handler = EnhancedHandler()

		// action
		unit.isKilled = true
		unit.run()

		// verify
		assert(unit.isKilled)
	}
}