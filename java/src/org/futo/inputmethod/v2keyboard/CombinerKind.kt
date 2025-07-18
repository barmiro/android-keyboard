package org.futo.inputmethod.v2keyboard

import org.futo.inputmethod.event.Combiner
import org.futo.inputmethod.event.DeadKeyCombiner
import org.futo.inputmethod.event.combiners.DeadKeyPreCombiner
import org.futo.inputmethod.event.combiners.KoreanCombiner

enum class CombinerKind(val factory: () -> Combiner) {
    DeadKey({ DeadKeyCombiner() }),
    DeadKeyPreCombiner({ DeadKeyPreCombiner() }),
    Korean({ KoreanCombiner() }),
    KoreanCombineInitials({ KoreanCombiner(combineInitials = true) })
}