package kotlin.p491i0;

import java.util.NoSuchElementException;
import kotlin.p557z.AbstractC13711l0;
/* compiled from: ProgressionIterators.kt */
/* renamed from: kotlin.i0.d */
/* loaded from: classes3.dex */
public final class C11836d extends AbstractC13711l0 {

    /* renamed from: c */
    private final int f26517c;

    /* renamed from: d */
    private boolean f26518d;

    /* renamed from: e */
    private int f26519e;

    /* renamed from: f */
    private final int f26520f;

    public C11836d(int i, int i2, int i3) {
        this.f26520f = i3;
        this.f26517c = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f26518d = z;
        this.f26519e = z ? i : this.f26517c;
    }

    @Override // kotlin.p557z.AbstractC13711l0
    /* renamed from: b */
    public int mo4069b() {
        int i = this.f26519e;
        if (i == this.f26517c) {
            if (this.f26518d) {
                this.f26518d = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f26519e = this.f26520f + i;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f26518d;
    }
}
