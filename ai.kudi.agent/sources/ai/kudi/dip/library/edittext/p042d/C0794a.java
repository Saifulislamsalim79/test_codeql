package ai.kudi.dip.library.edittext.p042d;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.e0.d.l;
/* compiled from: SavedState.kt */
/* renamed from: ai.kudi.dip.library.edittext.d.a */
/* loaded from: classes2.dex */
public final class C0794a extends View.BaseSavedState {
    public static final Parcelable.Creator<C0794a> CREATOR = new C0795a();

    /* renamed from: c */
    private SparseArray<Parcelable> f2235c;

    /* compiled from: SavedState.kt */
    /* renamed from: ai.kudi.dip.library.edittext.d.a$a */
    /* loaded from: classes2.dex */
    public static final class C0795a implements Parcelable.Creator<C0794a> {
        C0795a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C0794a createFromParcel(Parcel parcel) {
            l.f(parcel, TransactionField.TRANSACTION_CHANNEL);
            return new C0794a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C0794a[] newArray(int i) {
            return new C0794a[i];
        }
    }

    public C0794a(Parcelable parcelable) {
        super(parcelable);
    }

    /* renamed from: a */
    public final SparseArray<Parcelable> m37984a() {
        return this.f2235c;
    }

    /* renamed from: b */
    public final void m37983b(SparseArray<Parcelable> sparseArray) {
        this.f2235c = sparseArray;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        l.f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeSparseArray(this.f2235c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794a(Parcel parcel) {
        super(parcel);
        l.f(parcel, TransactionField.TRANSACTION_CHANNEL);
        this.f2235c = parcel.readSparseArray(C0794a.class.getClassLoader());
    }
}
