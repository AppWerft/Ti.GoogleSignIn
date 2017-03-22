/* C++ code produced by gperf version 3.0.3 */
/* Command-line: /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/gperf -L C++ -E -t /private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/googlesignin-generated/KrollGeneratedBindings.gperf  */
/* Computed positions: -k'' */

#line 3 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/googlesignin-generated/KrollGeneratedBindings.gperf"


#include <string.h>
#include <v8.h>
#include <KrollBindings.h>

#include "ti.googlesignin.GooglesigninModule.h"


#line 13 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/googlesignin-generated/KrollGeneratedBindings.gperf"
struct titanium::bindings::BindEntry;
/* maximum key range = 1, duplicates = 0 */

class GooglesigninBindings
{
private:
  static inline unsigned int hash (const char *str, unsigned int len);
public:
  static struct titanium::bindings::BindEntry *lookupGeneratedInit (const char *str, unsigned int len);
};

inline /*ARGSUSED*/
unsigned int
GooglesigninBindings::hash (register const char *str, register unsigned int len)
{
  return len;
}

struct titanium::bindings::BindEntry *
GooglesigninBindings::lookupGeneratedInit (register const char *str, register unsigned int len)
{
  enum
    {
      TOTAL_KEYWORDS = 1,
      MIN_WORD_LENGTH = 34,
      MAX_WORD_LENGTH = 34,
      MIN_HASH_VALUE = 34,
      MAX_HASH_VALUE = 34
    };

  static struct titanium::bindings::BindEntry wordlist[] =
    {
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""},
#line 15 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/googlesignin-generated/KrollGeneratedBindings.gperf"
      {"ti.googlesignin.GooglesigninModule", ::ti::googlesignin::GooglesigninModule::bindProxy, ::ti::googlesignin::GooglesigninModule::dispose}
    };

  if (len <= MAX_WORD_LENGTH && len >= MIN_WORD_LENGTH)
    {
      unsigned int key = hash (str, len);

      if (key <= MAX_HASH_VALUE)
        {
          register const char *s = wordlist[key].name;

          if (*str == *s && !strcmp (str + 1, s + 1))
            return &wordlist[key];
        }
    }
  return 0;
}
#line 16 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/googlesignin-generated/KrollGeneratedBindings.gperf"

