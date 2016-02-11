package se.omegapoint.cryptochallenge;

import se.omegapoint.cryptochallenge.utils.ByteBuffer;

import java.math.BigInteger;

public class DiffieHellmanWarmupChallenge {

    private final ByteBuffer p;
    private final ByteBuffer g;

    public DiffieHellmanWarmupChallenge(final ByteBuffer p, final ByteBuffer g) {
        this.p = p;
        this.g = g;
    }

    public BigInteger handshake(final BigInteger pub) {
        return new BigInteger("0");
    }

    public ByteBuffer message(final ByteBuffer cipherText, final ByteBuffer initializationVector) {
        return new ByteBuffer();
    }
}
