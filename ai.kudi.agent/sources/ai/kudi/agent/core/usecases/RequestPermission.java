package ai.kudi.agent.core.usecases;

import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: RequestPermission.kt */
@Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/core/usecases/RequestPermission;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "", "permission", "", "requestCode", "", "(Ljava/lang/String;I)V", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class RequestPermission implements OneInputUseCase<Boolean, Boolean> {
    private final String permission;
    private final int requestCode;

    public RequestPermission(String str, int i) {
        Log_OC.getArray(str, "permission");
        this.permission = str;
        this.requestCode = i;
    }
}
