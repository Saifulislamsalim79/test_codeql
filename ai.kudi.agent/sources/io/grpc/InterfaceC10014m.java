package io.grpc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: Codec.java */
/* renamed from: io.grpc.m */
/* loaded from: classes2.dex */
public interface InterfaceC10014m extends InterfaceC10033o, InterfaceC10080v {

    /* compiled from: Codec.java */
    /* renamed from: io.grpc.m$a */
    /* loaded from: classes2.dex */
    public static final class C10015a implements InterfaceC10014m {
        @Override // io.grpc.InterfaceC10033o, io.grpc.InterfaceC10080v
        /* renamed from: a */
        public String mo13106a() {
            return "gzip";
        }

        @Override // io.grpc.InterfaceC10080v
        /* renamed from: b */
        public InputStream mo13105b(InputStream inputStream) throws IOException {
            return new GZIPInputStream(inputStream);
        }

        @Override // io.grpc.InterfaceC10033o
        /* renamed from: c */
        public OutputStream mo13258c(OutputStream outputStream) throws IOException {
            return new GZIPOutputStream(outputStream);
        }
    }

    /* compiled from: Codec.java */
    /* renamed from: io.grpc.m$b */
    /* loaded from: classes2.dex */
    public static final class C10016b implements InterfaceC10014m {

        /* renamed from: a */
        public static final InterfaceC10014m f23740a = new C10016b();

        private C10016b() {
        }

        @Override // io.grpc.InterfaceC10033o, io.grpc.InterfaceC10080v
        /* renamed from: a */
        public String mo13106a() {
            return "identity";
        }

        @Override // io.grpc.InterfaceC10080v
        /* renamed from: b */
        public InputStream mo13105b(InputStream inputStream) {
            return inputStream;
        }

        @Override // io.grpc.InterfaceC10033o
        /* renamed from: c */
        public OutputStream mo13258c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
