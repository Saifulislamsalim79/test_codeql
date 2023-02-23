package pl.droidsonroids.gif;

import java.io.IOException;
/* loaded from: classes3.dex */
public class GifIOException extends IOException {

    /* renamed from: c */
    public final EnumC14744c f32958c;

    /* renamed from: d */
    private final String f32959d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GifIOException(int i, String str) {
        this.f32958c = EnumC14744c.m407a(i);
        this.f32959d = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f32959d == null) {
            return this.f32958c.m406b();
        }
        return this.f32958c.m406b() + ": " + this.f32959d;
    }
}
