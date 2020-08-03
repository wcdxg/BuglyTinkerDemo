package com.yuaihen.buglytinker;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by Yuaihen.
 * on 2020/8/3
 */
public class BaseApplication extends TinkerApplication {

    public BaseApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.yuaihen.buglytinker.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
