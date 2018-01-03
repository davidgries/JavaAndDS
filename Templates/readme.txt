CORNELL UNIVERSITY WEB TEMPLATES
Overview and Instructions
For more information, 
see http://www.cornell.edu/identity/templates/
**************************************************

==================================================
Overview
==================================================

These templates have been created to enable Cornell University units to build
websites in the cornell.edu style. The step-by-step instructions below and
extensive inline documentation (HTML and CSS comments) are written so that
webmasters with a basic understanding of HTML and CSS can quickly and easily
deploy readymade pages that conform to the Cornell University identity
guidelines and integrate seamlessly with Cornell's online presence.

This set of templates includes seven page types, which account for the majority
of pages found within cornell.edu.

1. One Column
    The One Column template provides code to create a generic page containing a header, content area, and footer. This template sets the framework for all of the other templates. 
2. Hub
    The Hub template provides code to create a page like About Cornell. The Hub template should be used as an umbrella page for a set of related sub-sites. 
3. Bridge/Overview
    The Bridge template provides code to create a page like Cornell Research. The Bridge template should be used as a portal to a variety of decentralized information. 
4. Two Column
    The Two Column template provides code to create a page like Cornell
    Academics. The Two Column template should be used to implement a section of
    a site, complete with section-specific navigation.
5. Photo Gallery
    The Photo Gallery template provides code to create a page like the Office of the President Photo Gallery. The Photo Gallery template should be used as an index of several large, related photos. 
6. Photo
    The Photo template provides code to create a page like any of the photos in the Office of the President Photo Gallery. The Photo template should be used to display a large photo with a caption and credit. 
7. Banner Only
    The Banner template provides an empty page with the Cornell University banner at the top. This template should be used as the basis of a site that uses a Cornell University banner but not the cornell.edu style. 

Coding Standards and Tested Browsers

All of the templates are coded using valid, semantic XHTML 1.0 Transitional for
structure and valid CSS for presentation. For each set of templates, the look
and feel of all seven page types is controlled by a single stylesheet.

All of the templates have been tested for consistency in the following
browsers:

    * Internet Explorer 5.5 and 6 for Windows
    * Firefox 1
    *
Netscape 7.1 (also covers Mozilla browsers)
    * Safari for Mac OS X
    *
Internet Explorer 5 for Mac OS X and Mac OS 9
    * AOL 9 for Windows
    * AOL
for Mac OS X

==================================================
Instructions
==================================================

These instructions assume a basic knowledge of HTML and CSS. If you are
familiar with web standards and CSS-driven layout, you will probably find the
templates intuitive to use. Otherwise, please be patient, and resist the urge
to use layout tables, spacer graphics, or font tags. If you need help
implementing these templates, please contact Lisa Cameron-Norfleet
(hck1@cornell.edu).

--------------------------------------------------
Step 1: Choose a Set of Templates
--------------------------------------------------

A number of factors will determine which set of templates is appropriate for
your project. If your group has a unit signature, consider using a set with a
unit signature banner (75 pixel for two-line signatures, 88 pixel for
three-line signatures); these templates can accomodate a larger heirarchy of
pages than the others.

--------------------------------------------------
Step 2: Download the Templates
--------------------------------------------------

Once you have determined which banner size and color to use, download and
extract the templates for your platform. You may need to install Stuffit
Expander (Macintosh) or WinZip (PC) to extract the archives.

--------------------------------------------------
Step 3: Get Familiar
--------------------------------------------------

Open the HTML and CSS files in a text editor and read through the comments in
the code (CSS files are found in the styles folder). It will be helpful to
start with the HTML files, especially if you are unfamiliar with using CSS for
layout.

If you are using a visual editor such as Dreamweaver or Frontpage, it is
important that you work with these templates in code view. If you are
uncomfortable working in code view, please be aware that these editors render
CSS differently from web browsers. Although the templates will look odd in the
preview window of the editor, there is nothing wrong with them.

The discrepancies between editor and browser rendering are most evident in the
following areas of the templates: Cornell banners (screenshot 1, screenshot 2)
and accompanying navigation, the Photo Gallery (screenshot), and any Two Column
template (screenshot) with section navigation.

After making changes to the templates, please make sure your content is
rendering correctly in a web browser.

--------------------------------------------------
Step 4: Copy Files
--------------------------------------------------

Copy favicon.ico and the images and styles directories to the root of your web
server. Copy one of the HTML files to the root of your web server and rename it
to index.html. This will be your homepage, so choose a page template that is
appropriate (most likely onecolumn.html or twocolumn.html).

--------------------------------------------------
Step 5: Make Global Changes
--------------------------------------------------

This is the time to make basic changes that will affect all of the pages in
your site. If you are creating a dynamic website, you may need to change the
file extensions of the HTML files (including the ones you have not yet copied
to your web server) to .php, .cfm, .asp, etc., depending on the configuration
of your web server.

This is a good time to go through each template and replace placeholders with
actual values. For example, replace "Unit Name Goes Here" and the contents of
the <title> tag with your unit's name, and populate the primary and secondary
navigation with links to the pages that will make up your website.

Unit Signatures

If you are using a set of templates with a unit signature banner, you will need
to replace images/layout/unit_signature.gif with your own unit signature. After
renaming your unit signature file to unit_signature.gif and placing it in
images/layout/, open styles/main.css, find #unit-signature-links a, and set the
width value to:

* 68 pixels less than the total width of your two-line unit signature image.
For example, if your unit signature is 268 pixels wide, set the width value to
200px.

* 80 pixels less than the total width of your three-line unit signature image.
For example, if your unit signature is 380 pixels wide, set the width value to
300px.

You must also replace images/unit_signature_unstyled.gif with your own
two-color unit signature. This is the image shown to browsers that cannot
render the templates' stylesheet (e.g. Netscape Navigator 4). Save your
two-color unit signature image as images/unit_signature_unstyled.gif.

Banner Options

If you are using a set of templates with a unit signature banner, make sure you
choose a search interface that is appropriate to your needs and capabilities.
If you choose to use the search form with the option to search either your unit
website or all of cornell.edu, you must modify the form to work with your
site's search engine. Also, you will have to modify the "more options" link to
make it link to either the "more options" search page for cornell.edu or to the
"more options" page for your own unit search.

Although every available search interface option is offered as a separate
download, every unit signature template set includes the alternate search
interface configurations in the form of HTML and CSS comments. If you change
your mind about the search interface you should use, follow the instructions in
the HTML files and styles/main.css to enable the appropriate configuration.
Make sure you appy any changes to every HTML file.

All of the templates begin with a link that allows users with special
accessibility needs to skip reptitive navigation elements and proceed directly
to the main contents of the page. This link is hidden from general users with
visual browsers that can render the templates' layout (although the link is
hidden, it can still be accessed using the tab key). However, if you wish to
display the "skip to content" link to all users, follow the instructions in
styles/main.css (look for #skipnav near the end of the file).

The 75 and 88 pixel banners feature an image of Ezra Cornell in the background.
To disable or change this image, follow the instructions in styles/main.css
(look for #cu-identity near the top of the file). There are eight available
background images for each banner size and color.

--------------------------------------------------
Step 6: Build the Website
--------------------------------------------------

For each page in your website, decide which page template you will need to use,
copy it to your web server, and rename it to something appropriate. Be sure to
create an organized heirarchy of files and directories that reflects the
heirarchy of your website.

As you begin to populate the pages with real content, consult the HTML and CSS
comments in the original template files to properly mark up your documents. It
is necessary to adhere strictly to the structural and naming conventions
provided in the templates.

The templates are coded such that all of the presentation is controlled through
CSS, while the HTML files contain only content and tags that describe the
content. Do not attempt to format content using layout tables, spacer graphics,
or font tags in the HTML files. Use basic HTML to mark up your content (e.g.
paragraphs go in <p> tags).

If you find that your content is not displaying correctly, try copying a
similar passage of fake content from one of the original templates and
replacing only what you need to. Pay particularly close attention to the class
and ID attributes of the elements that constitute the various pages.

All of the templates are built using a version of HTML called XHTML 1.0
Transitional. It is important to keep in mind that XHTML 1.0 differs slightly
from older versions of HTML. There are many good XHTML tutorials available
online, including many that explain the differences between XHTML and earlier
versions of HTML. The following resources are good starting places:

    * http://www.w3schools.com/xhtml/xhtml_intro.asp
    * http://www.w3schools.com/xhtml/xhtml_html.asp
