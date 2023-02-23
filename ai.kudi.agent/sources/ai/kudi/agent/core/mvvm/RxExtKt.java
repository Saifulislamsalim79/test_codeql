package ai.kudi.agent.core.mvvm;

import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
/* compiled from: RxExt.kt */
@Metadata(m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m10421d2 = {"addTo", "Lio/reactivex/disposables/Disposable;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RxExtKt {
    public static final FavoritesArrayAdapter addTo(FavoritesArrayAdapter favoritesArrayAdapter, C11280b c11280b) {
        Log_OC.getArray(favoritesArrayAdapter, "<this>");
        Log_OC.getArray(c11280b, "compositeDisposable");
        c11280b.b(favoritesArrayAdapter);
        return favoritesArrayAdapter;
    }
}
