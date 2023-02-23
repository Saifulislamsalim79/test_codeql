package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.p476c0.InterfaceC11719g;
/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, m10421d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext$Element;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "Key", "kotlinx-coroutines-core"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface CoroutineExceptionHandler extends InterfaceC11719g.InterfaceC11722b {

    /* renamed from: t */
    public static final C13746a f30180t = C13746a.f30181c;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    /* loaded from: classes3.dex */
    public static final class C13746a implements InterfaceC11719g.InterfaceC11724c<CoroutineExceptionHandler> {

        /* renamed from: c */
        static final /* synthetic */ C13746a f30181c = new C13746a();

        private C13746a() {
        }
    }

    void handleException(InterfaceC11719g interfaceC11719g, Throwable th);
}
