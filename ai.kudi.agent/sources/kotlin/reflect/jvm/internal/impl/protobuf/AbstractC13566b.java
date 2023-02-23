package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
/* compiled from: AbstractParser.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b */
/* loaded from: classes3.dex */
public abstract class AbstractC13566b<MessageType extends InterfaceC13601o> implements InterfaceC13604q<MessageType> {
    static {
        C13575f.m4477c();
    }

    /* renamed from: e */
    private MessageType m4551e(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.mo4379h()) {
            return messagetype;
        }
        InvalidProtocolBufferException m4556a = m4550f(messagetype).m4556a();
        m4556a.m4559i(messagetype);
        throw m4556a;
    }

    /* renamed from: f */
    private UninitializedMessageException m4550f(MessageType messagetype) {
        if (messagetype instanceof AbstractC13563a) {
            return ((AbstractC13563a) messagetype).m4555e();
        }
        return new UninitializedMessageException(messagetype);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
    /* renamed from: g */
    public MessageType mo4376c(InputStream inputStream, C13575f c13575f) throws InvalidProtocolBufferException {
        MessageType m4546j = m4546j(inputStream, c13575f);
        m4551e(m4546j);
        return m4546j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
    /* renamed from: h */
    public MessageType mo4378a(InputStream inputStream, C13575f c13575f) throws InvalidProtocolBufferException {
        MessageType m4545k = m4545k(inputStream, c13575f);
        m4551e(m4545k);
        return m4545k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
    /* renamed from: i */
    public MessageType mo4375d(AbstractC13570d abstractC13570d, C13575f c13575f) throws InvalidProtocolBufferException {
        MessageType m4544l = m4544l(abstractC13570d, c13575f);
        m4551e(m4544l);
        return m4544l;
    }

    /* renamed from: j */
    public MessageType m4546j(InputStream inputStream, C13575f c13575f) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return m4545k(new AbstractC13563a.AbstractC13564a.C13565a(inputStream, C13573e.m4525B(read, inputStream)), c13575f);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e.getMessage());
        }
    }

    /* renamed from: k */
    public MessageType m4545k(InputStream inputStream, C13575f c13575f) throws InvalidProtocolBufferException {
        C13573e m4500g = C13573e.m4500g(inputStream);
        MessageType messagetype = (MessageType) mo4377b(m4500g, c13575f);
        try {
            m4500g.m4506a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            e.m4559i(messagetype);
            throw e;
        }
    }

    /* renamed from: l */
    public MessageType m4544l(AbstractC13570d abstractC13570d, C13575f c13575f) throws InvalidProtocolBufferException {
        try {
            C13573e mo4371J = abstractC13570d.mo4371J();
            MessageType messagetype = (MessageType) mo4377b(mo4371J, c13575f);
            try {
                mo4371J.m4506a(0);
                return messagetype;
            } catch (InvalidProtocolBufferException e) {
                e.m4559i(messagetype);
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }
}
