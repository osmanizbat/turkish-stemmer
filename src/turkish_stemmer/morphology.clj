(ns turkish-stemmer.morphology
  (:import (java.util Locale)))

(def vowel-letter? #{\a \e \ı \i \o \ö \u \ü})

(def locale (Locale. "TR"))

(defn lower-case[s]
  (.toLowerCase s locale))


