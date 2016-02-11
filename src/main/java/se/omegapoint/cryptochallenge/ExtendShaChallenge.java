package se.omegapoint.cryptochallenge;

import se.omegapoint.cryptochallenge.utils.ByteBuffer;

public class ExtendShaChallenge {

    private final ByteBuffer originalPlainText;
    private final ByteBuffer originalMac;
    private final int keyLength;

    public ExtendShaChallenge(final ByteBuffer originalPlainText, final ByteBuffer originalMac, final int keyLength) {
        this.originalPlainText = originalPlainText;
        this.originalMac = originalMac;
        this.keyLength = keyLength;
    }

    public ForgedMessage constructForgedMessage() {
        return new ForgedMessage(new ByteBuffer(), new ByteBuffer());
    }

    public static class ForgedMessage {

        public final ByteBuffer forgedPlainText;
        public final ByteBuffer forgedHash;

        public ForgedMessage(ByteBuffer forgedPlainText, ByteBuffer forgedHash) {
            this.forgedPlainText = forgedPlainText;
            this.forgedHash = forgedHash;
        }
    }
}
