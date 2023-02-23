package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.internal.InterfaceC5005y;
import com.google.android.play.core.tasks.C5013e;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.i0 */
/* loaded from: classes2.dex */
public final class C4875i0 {

    /* renamed from: a */
    private final InterfaceC5005y<InterfaceC4883j3> f12351a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4875i0(InterfaceC5005y<InterfaceC4883j3> interfaceC5005y) {
        this.f12351a = interfaceC5005y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final InputStream m26110a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C5013e.m25867e(this.f12351a.m25876a().mo26014c(i, str, str2, i2));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new C4923t0(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), i);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e) {
            throw new C4923t0("Extractor was interrupted while waiting for chunk file.", e, i);
        } catch (ExecutionException e2) {
            throw new C4923t0(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), e2, i);
        }
    }
}
