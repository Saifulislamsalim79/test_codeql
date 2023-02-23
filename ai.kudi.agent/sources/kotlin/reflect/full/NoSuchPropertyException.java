package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.e0.d.g;
/* compiled from: exceptions.kt */
@Metadata(m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m10421d2 = {"Lkotlin/reflect/full/NoSuchPropertyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "(Ljava/lang/Exception;)V", "kotlin-reflection"}, k = 1, m10420mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class NoSuchPropertyException extends Exception {
    public NoSuchPropertyException() {
        this(null, 1, null);
    }

    public NoSuchPropertyException(Exception exc) {
        super(exc);
    }

    public /* synthetic */ NoSuchPropertyException(Exception exc, int i, g gVar) {
        this((i & 1) != 0 ? null : exc);
    }
}
