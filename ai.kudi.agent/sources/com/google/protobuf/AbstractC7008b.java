package com.google.protobuf;

import com.google.protobuf.AbstractC6994a;
import com.google.protobuf.InterfaceC7100r0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: AbstractParser.java */
/* renamed from: com.google.protobuf.b */
/* loaded from: classes2.dex */
public abstract class AbstractC7008b<MessageType extends InterfaceC7100r0> implements InterfaceC7007a1<MessageType> {
    private static final C7089p EMPTY_REGISTRY = C7089p.m19769b();

    private MessageType checkMessageInitialized(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.mo19363h()) {
            return messagetype;
        }
        InvalidProtocolBufferException m20244a = newUninitializedMessageException(messagetype).m20244a();
        m20244a.m20247l(messagetype);
        throw m20244a;
    }

    private UninitializedMessageException newUninitializedMessageException(MessageType messagetype) {
        if (messagetype instanceof AbstractC6994a) {
            return ((AbstractC6994a) messagetype).m20240u();
        }
        return new UninitializedMessageException(messagetype);
    }

    @Override // com.google.protobuf.InterfaceC7007a1
    public MessageType parseDelimitedFrom(InputStream inputStream, C7089p c7089p) throws InvalidProtocolBufferException {
        return checkMessageInitialized(m41887parsePartialDelimitedFrom(inputStream, c7089p));
    }

    /* renamed from: parsePartialDelimitedFrom */
    public MessageType m41887parsePartialDelimitedFrom(InputStream inputStream, C7089p c7089p) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return m41892parsePartialFrom((InputStream) new AbstractC6994a.AbstractC6995a.C6996a(inputStream, AbstractC7052j.m20060x(read, inputStream)), c7089p);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e);
        }
    }

    @Override // com.google.protobuf.InterfaceC7007a1
    public MessageType parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialDelimitedFrom */
    public MessageType m41886parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return m41887parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom */
    public MessageType m41890parsePartialFrom(AbstractC7052j abstractC7052j) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(abstractC7052j, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom */
    public MessageType m41889parsePartialFrom(AbstractC7039i abstractC7039i, C7089p c7089p) throws InvalidProtocolBufferException {
        try {
            AbstractC7052j mo19323J = abstractC7039i.mo19323J();
            MessageType messagetype = (MessageType) parsePartialFrom(mo19323J, c7089p);
            try {
                mo19323J.mo19999a(0);
                return messagetype;
            } catch (InvalidProtocolBufferException e) {
                e.m20247l(messagetype);
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC7007a1
    public MessageType parseFrom(AbstractC7052j abstractC7052j, C7089p c7089p) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized((InterfaceC7100r0) parsePartialFrom(abstractC7052j, c7089p));
    }

    @Override // com.google.protobuf.InterfaceC7007a1
    public MessageType parseFrom(AbstractC7052j abstractC7052j) throws InvalidProtocolBufferException {
        return parseFrom(abstractC7052j, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC7007a1
    public MessageType parseFrom(AbstractC7039i abstractC7039i, C7089p c7089p) throws InvalidProtocolBufferException {
        return checkMessageInitialized(m41889parsePartialFrom(abstractC7039i, c7089p));
    }

    @Override // com.google.protobuf.InterfaceC7007a1
    public MessageType parseFrom(AbstractC7039i abstractC7039i) throws InvalidProtocolBufferException {
        return parseFrom(abstractC7039i, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom */
    public MessageType m41888parsePartialFrom(AbstractC7039i abstractC7039i) throws InvalidProtocolBufferException {
        return m41889parsePartialFrom(abstractC7039i, EMPTY_REGISTRY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: parseFrom */
    public MessageType m41883parseFrom(ByteBuffer byteBuffer, C7089p c7089p) throws InvalidProtocolBufferException {
        try {
            AbstractC7052j m20065h = AbstractC7052j.m20065h(byteBuffer);
            InterfaceC7100r0 interfaceC7100r0 = (InterfaceC7100r0) parsePartialFrom(m20065h, c7089p);
            try {
                m20065h.mo19999a(0);
                return (MessageType) checkMessageInitialized(interfaceC7100r0);
            } catch (InvalidProtocolBufferException e) {
                e.m20247l(interfaceC7100r0);
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    @Override // 
    /* renamed from: parsePartialFrom */
    public MessageType mo41895parsePartialFrom(byte[] bArr, int i, int i2, C7089p c7089p) throws InvalidProtocolBufferException {
        try {
            AbstractC7052j m20062k = AbstractC7052j.m20062k(bArr, i, i2);
            MessageType messagetype = (MessageType) parsePartialFrom(m20062k, c7089p);
            try {
                m20062k.mo19999a(0);
                return messagetype;
            } catch (InvalidProtocolBufferException e) {
                e.m20247l(messagetype);
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    /* renamed from: parsePartialFrom */
    public MessageType m41894parsePartialFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return mo41895parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    /* renamed from: parseFrom */
    public MessageType m41882parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return m41883parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom */
    public MessageType m41896parsePartialFrom(byte[] bArr, C7089p c7089p) throws InvalidProtocolBufferException {
        return mo41895parsePartialFrom(bArr, 0, bArr.length, c7089p);
    }

    /* renamed from: parseFrom */
    public MessageType m41885parseFrom(byte[] bArr, int i, int i2, C7089p c7089p) throws InvalidProtocolBufferException {
        return checkMessageInitialized(mo41895parsePartialFrom(bArr, i, i2, c7089p));
    }

    /* renamed from: parsePartialFrom */
    public MessageType m41893parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return mo41895parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    /* renamed from: parseFrom */
    public MessageType m41884parseFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return m41885parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom */
    public MessageType m41892parsePartialFrom(InputStream inputStream, C7089p c7089p) throws InvalidProtocolBufferException {
        AbstractC7052j m20067f = AbstractC7052j.m20067f(inputStream);
        MessageType messagetype = (MessageType) parsePartialFrom(m20067f, c7089p);
        try {
            m20067f.mo19999a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            e.m20247l(messagetype);
            throw e;
        }
    }

    @Override // com.google.protobuf.InterfaceC7007a1
    public MessageType parseFrom(byte[] bArr, C7089p c7089p) throws InvalidProtocolBufferException {
        return m41885parseFrom(bArr, 0, bArr.length, c7089p);
    }

    @Override // com.google.protobuf.InterfaceC7007a1
    public MessageType parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC7007a1
    public MessageType parseFrom(InputStream inputStream, C7089p c7089p) throws InvalidProtocolBufferException {
        return checkMessageInitialized(m41892parsePartialFrom(inputStream, c7089p));
    }

    @Override // com.google.protobuf.InterfaceC7007a1
    public MessageType parseFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom */
    public MessageType m41891parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return m41892parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }
}
