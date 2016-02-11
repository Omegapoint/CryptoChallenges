package se.omegapoint.cryptochallenge;

import se.omegapoint.cryptochallenge.utils.ByteBuffer;

import java.math.BigInteger;

public class DiffieHellmanMitmChallenge {

    public interface Client {
        ByteBuffer sessionSecret();

        ByteBuffer lastMessage();

        void onMessage(final Client sender, final ByteBuffer receivedCipherText, final ByteBuffer receivedInitializationVector);
    }

    public interface MasterClient extends Client {
        void connectTo(final SlaveClient target);

        void sendMessage(final Client target, final ByteBuffer message);

        void onHandshake(final Client sender, final BigInteger pub);
    }

    public interface SlaveClient extends Client {
        void onConnect(final MasterClient sender, final ByteBuffer p, final ByteBuffer g, final BigInteger pub);
    }

    public interface MitmClient extends MasterClient, SlaveClient {
    }

    public MasterClient createMaster(final ByteBuffer p, final ByteBuffer g) {
        return new MasterClient() {
            @Override
            public void connectTo(final SlaveClient target) {

            }

            @Override
            public void sendMessage(final Client target, final ByteBuffer message) {

            }

            @Override
            public void onHandshake(final Client sender, final BigInteger pub) {

            }

            @Override
            public ByteBuffer sessionSecret() {
                return new ByteBuffer();
            }

            @Override
            public ByteBuffer lastMessage() {
                return new ByteBuffer();
            }

            @Override
            public void onMessage(final Client sender, final ByteBuffer receivedCipherText, final ByteBuffer receivedInitializationVector) {

            }
        };
    }

    public SlaveClient createSlave() {
        return new SlaveClient() {
            @Override
            public void onConnect(final MasterClient sender, final ByteBuffer p, final ByteBuffer g, final BigInteger pub) {

            }

            @Override
            public ByteBuffer sessionSecret() {
                return new ByteBuffer();
            }

            @Override
            public ByteBuffer lastMessage() {
                return new ByteBuffer();
            }

            @Override
            public void onMessage(final Client sender, final ByteBuffer receivedCipherText, final ByteBuffer receivedInitializationVector) {

            }
        };
    }

    public MitmClient createMitm(final MasterClient master, final SlaveClient slave) {
        return new MitmClient() {
            @Override
            public void connectTo(final SlaveClient target) {

            }

            @Override
            public void sendMessage(final Client target, final ByteBuffer message) {

            }

            @Override
            public void onHandshake(final Client sender, final BigInteger pub) {

            }

            @Override
            public void onConnect(final MasterClient sender, final ByteBuffer p, final ByteBuffer g, final BigInteger pub) {

            }

            @Override
            public ByteBuffer sessionSecret() {
                return new ByteBuffer();
            }

            @Override
            public ByteBuffer lastMessage() {
                return new ByteBuffer();
            }

            @Override
            public void onMessage(final Client sender, final ByteBuffer receivedCipherText, final ByteBuffer receivedInitializationVector) {

            }
        };
    }

}
