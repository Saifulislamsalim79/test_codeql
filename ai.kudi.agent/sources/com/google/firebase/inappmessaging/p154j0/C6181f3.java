package com.google.firebase.inappmessaging.p154j0;

import android.app.Application;
import com.google.protobuf.AbstractC6994a;
import com.google.protobuf.InterfaceC7007a1;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11677k;
/* compiled from: ProtoStorageClient.java */
/* renamed from: com.google.firebase.inappmessaging.j0.f3 */
/* loaded from: classes2.dex */
public class C6181f3 {

    /* renamed from: a */
    private final Application f15041a;

    /* renamed from: b */
    private final String f15042b;

    public C6181f3(Application application, String str) {
        this.f15041a = application;
        this.f15042b = str;
    }

    /* renamed from: a */
    public /* synthetic */ AbstractC6994a m22599a(InterfaceC7007a1 interfaceC7007a1) throws Exception {
        synchronized (this) {
            try {
                FileInputStream openFileInput = this.f15041a.openFileInput(this.f15042b);
                try {
                    AbstractC6994a abstractC6994a = (AbstractC6994a) interfaceC7007a1.parseFrom(openFileInput);
                    if (openFileInput != null) {
                        openFileInput.close();
                    }
                    return abstractC6994a;
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException | FileNotFoundException e) {
                C6163c3.m22619c("Recoverable exception while reading cache: " + e.getMessage());
                return null;
            }
        }
    }

    /* renamed from: b */
    public /* synthetic */ Object m22598b(AbstractC6994a abstractC6994a) throws Exception {
        synchronized (this) {
            FileOutputStream openFileOutput = this.f15041a.openFileOutput(this.f15042b, 0);
            openFileOutput.write(abstractC6994a.mo19709e());
            if (openFileOutput != null) {
                openFileOutput.close();
            }
        }
        return abstractC6994a;
    }

    /* renamed from: c */
    public <T extends AbstractC6994a> AbstractC11677k<T> m22597c(final InterfaceC7007a1<T> interfaceC7007a1) {
        return AbstractC11677k.m10591l(new Callable() { // from class: com.google.firebase.inappmessaging.j0.t1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6181f3.this.m22599a(interfaceC7007a1);
            }
        });
    }

    /* renamed from: d */
    public AbstractC11271b m22596d(final AbstractC6994a abstractC6994a) {
        return AbstractC11271b.m11239l(new Callable() { // from class: com.google.firebase.inappmessaging.j0.s1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6181f3.this.m22598b(abstractC6994a);
            }
        });
    }
}
