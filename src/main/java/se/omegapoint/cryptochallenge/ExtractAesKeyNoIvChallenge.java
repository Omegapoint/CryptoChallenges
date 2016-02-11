package se.omegapoint.cryptochallenge;

import se.omegapoint.cryptochallenge.utils.AdvancedEncryptionStandard;
import se.omegapoint.cryptochallenge.utils.ByteBuffer;

public class ExtractAesKeyNoIvChallenge {

    private final AdvancedEncryptionStandard.NoIv aes;

    public ExtractAesKeyNoIvChallenge(final AdvancedEncryptionStandard.NoIv aes) {
        this.aes = aes;
    }

    public ByteBuffer extractKeyFromCipherText(final ByteBuffer cipherText) {
        return new ByteBuffer();
    }

}
