package com.google.firebase.database.tubesock;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MessageBuilderFactory.java */
/* renamed from: com.google.firebase.database.tubesock.a */
/* loaded from: classes2.dex */
class C5902a {

    /* compiled from: MessageBuilderFactory.java */
    /* renamed from: com.google.firebase.database.tubesock.a$a */
    /* loaded from: classes2.dex */
    static class C5903a implements InterfaceC5904b {

        /* renamed from: b */
        private int f14497b = 0;

        /* renamed from: a */
        private List<byte[]> f14496a = new ArrayList();

        C5903a() {
        }

        @Override // com.google.firebase.database.tubesock.C5902a.InterfaceC5904b
        /* renamed from: a */
        public boolean mo23354a(byte[] bArr) {
            this.f14496a.add(bArr);
            this.f14497b += bArr.length;
            return true;
        }

        @Override // com.google.firebase.database.tubesock.C5902a.InterfaceC5904b
        /* renamed from: b */
        public C5916f mo23353b() {
            byte[] bArr = new byte[this.f14497b];
            int i = 0;
            for (int i2 = 0; i2 < this.f14496a.size(); i2++) {
                byte[] bArr2 = this.f14496a.get(i2);
                System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
                i += bArr2.length;
            }
            return new C5916f(bArr);
        }
    }

    /* compiled from: MessageBuilderFactory.java */
    /* renamed from: com.google.firebase.database.tubesock.a$b */
    /* loaded from: classes2.dex */
    interface InterfaceC5904b {
        /* renamed from: a */
        boolean mo23354a(byte[] bArr);

        /* renamed from: b */
        C5916f mo23353b();
    }

    /* compiled from: MessageBuilderFactory.java */
    /* renamed from: com.google.firebase.database.tubesock.a$c */
    /* loaded from: classes2.dex */
    static class C5905c implements InterfaceC5904b {

        /* renamed from: c */
        private static ThreadLocal<CharsetDecoder> f14498c = new C5906a();

        /* renamed from: a */
        private StringBuilder f14499a = new StringBuilder();

        /* renamed from: b */
        private ByteBuffer f14500b;

        /* compiled from: MessageBuilderFactory.java */
        /* renamed from: com.google.firebase.database.tubesock.a$c$a */
        /* loaded from: classes2.dex */
        class C5906a extends ThreadLocal<CharsetDecoder> {
            C5906a() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: a */
            public CharsetDecoder initialValue() {
                CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
                newDecoder.onMalformedInput(CodingErrorAction.REPORT);
                newDecoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newDecoder;
            }
        }

        /* compiled from: MessageBuilderFactory.java */
        /* renamed from: com.google.firebase.database.tubesock.a$c$b */
        /* loaded from: classes2.dex */
        class C5907b extends ThreadLocal<CharsetEncoder> {
            C5907b() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: a */
            public CharsetEncoder initialValue() {
                CharsetEncoder newEncoder = Charset.forName("UTF8").newEncoder();
                newEncoder.onMalformedInput(CodingErrorAction.REPORT);
                newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newEncoder;
            }
        }

        static {
            new C5907b();
        }

        C5905c() {
        }

        /* renamed from: c */
        private String m23352c(byte[] bArr) {
            try {
                return f14498c.get().decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException unused) {
                return null;
            }
        }

        @Override // com.google.firebase.database.tubesock.C5902a.InterfaceC5904b
        /* renamed from: a */
        public boolean mo23354a(byte[] bArr) {
            String m23352c = m23352c(bArr);
            if (m23352c != null) {
                this.f14499a.append(m23352c);
                return true;
            }
            return false;
        }

        @Override // com.google.firebase.database.tubesock.C5902a.InterfaceC5904b
        /* renamed from: b */
        public C5916f mo23353b() {
            if (this.f14500b != null) {
                return null;
            }
            return new C5916f(this.f14499a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC5904b m23355a(byte b) {
        if (b == 2) {
            return new C5903a();
        }
        return new C5905c();
    }
}
