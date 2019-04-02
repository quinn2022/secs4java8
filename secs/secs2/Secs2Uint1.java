package secs.secs2;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.List;

public class Secs2Uint1 extends Secs2BigInteger {
	
	private static final Secs2Item secs2Item = Secs2Item.UINT1;
	
	public Secs2Uint1(int... values) {
		super(values);
	}

	public Secs2Uint1(long... values) {
		super(values);
	}

	public Secs2Uint1(BigInteger... values) {
		super(values);
	}

	public Secs2Uint1(List<Number> values) {
		super(values);
	}

	protected Secs2Uint1(byte[] bs) {
		super(bs);
	}

	@Override
	protected BigInteger byteBufferGetter(ByteBuffer bf) {
		return getBigInteger(bf, true);
	}

	@Override
	protected void byteBufferPutter(ByteBuffer bf, BigInteger value) {
		bf.put(value.byteValue());
	}

	@Override
	public Secs2Item secs2Item() {
		return secs2Item;
	}

}
