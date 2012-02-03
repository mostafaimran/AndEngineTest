package org.andengine.util.adt.list;


/**
 * @author Nicolas Gramlich
 * @since 22:31:38 - 16.09.2010
 */
public class ShiftQueueTest extends QueueTest {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================


	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	protected IQueue<Integer> newQueue(final int pInitialCapacity) {
		return new ShiftQueue<Integer>(pInitialCapacity);
	}
	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}